package iim.orangina.studentapi.repository;

import iim.orangina.studentapi.enums.StudentColumnNames;
import iim.orangina.studentapi.jdbc.StudentRowMapper;
import iim.orangina.studentapi.model.Student;
import lombok.RequiredArgsConstructor;
import org.springframework.jdbc.core.namedparam.MapSqlParameterSource;
import org.springframework.jdbc.core.namedparam.NamedParameterJdbcTemplate;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
@RequiredArgsConstructor
public class StudentRepository {

    private final StudentRowMapper studentRowMapper;
    private final NamedParameterJdbcTemplate namedParameterJdbcTemplate;

    private static final String GET_STUDENTS_BY_TAGS_SQL =
            "SELECT * " +
            "FROM STUDENTS " +
            "WHERE (:" + StudentColumnNames.CONTRACT.name() + "::varchar(255) IS NULL OR " + StudentColumnNames.CONTRACT.name() + " = :" + StudentColumnNames.CONTRACT.name() + "::varchar(255)) " +
            "AND (:" + StudentColumnNames.JOBS.name() + "::varchar(255) IS NULL OR " + StudentColumnNames.JOBS.name() + " = :" + StudentColumnNames.JOBS.name() + "::varchar(255)) " +
            "AND (:" + StudentColumnNames.EXPERIENCE.name() + "::integer IS NULL OR " + StudentColumnNames.EXPERIENCE.name() + " = :" + StudentColumnNames.EXPERIENCE.name() + "::integer) " +
            "AND (:" + StudentColumnNames.ACTIVITIES.name() + "::varchar(255) IS NULL OR " + StudentColumnNames.ACTIVITIES.name() + " = :" + StudentColumnNames.ACTIVITIES.name() + "::varchar(255))";

    public List<Student> getStudentsByTags(String contract, String jobs, Integer experience, String activities) {
        var sps = new MapSqlParameterSource();

        sps.addValue(StudentColumnNames.CONTRACT.name(), contract);
        sps.addValue(StudentColumnNames.JOBS.name(), jobs);
        sps.addValue(StudentColumnNames.EXPERIENCE.name(), experience);
        sps.addValue(StudentColumnNames.ACTIVITIES.name(), activities);

        return namedParameterJdbcTemplate.query(GET_STUDENTS_BY_TAGS_SQL, sps, studentRowMapper);
    }
}
