package iim.orangina.studentapi.jdbc;

import iim.orangina.studentapi.enums.StudentColumnNames;
import iim.orangina.studentapi.model.Student;
import org.springframework.jdbc.core.RowMapper;
import org.springframework.stereotype.Component;

import java.sql.ResultSet;
import java.sql.SQLException;

@Component
public class StudentRowMapper implements RowMapper<Student> {

    @Override
    public Student mapRow(ResultSet rs, int rowNum) throws SQLException {
        var result = new Student();

        result.setId(rs.getLong(StudentColumnNames.ID.name()));
        result.setFirstName(rs.getString(StudentColumnNames.FIRST_NAME.name()));
        result.setLastName(rs.getString(StudentColumnNames.LAST_NAME.name()));
        result.setEmail(rs.getString(StudentColumnNames.EMAIL.name()));
        result.setContract(rs.getString(StudentColumnNames.CONTRACT.name()));
        result.setJobs(rs.getString(StudentColumnNames.JOBS.name()));
        result.setExperience(rs.getInt(StudentColumnNames.EXPERIENCE.name()));
        result.setActivities(rs.getString(StudentColumnNames.ACTIVITIES.name()));

        return result;
    }
}
