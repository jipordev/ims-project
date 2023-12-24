package co.cstad.database;

import co.cstad.model.ReportDTO;
import java.util.ArrayList;
import java.util.List;

public class ReportDatabase {

    private final List<ReportDTO> reportDTOList;
    public ReportDatabase() {
       reportDTOList = new ArrayList<>();
    }

    public List<ReportDTO> getReportDTOList(){
        return reportDTOList;
    }

}
