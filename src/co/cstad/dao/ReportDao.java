package co.cstad.dao;


import co.cstad.model.ReportDTO;

import java.util.List;
import java.util.Optional;

public interface ReportDao {
    ReportDTO insert(ReportDTO report);
    List<ReportDTO> select();
    Optional<ReportDTO> selectByid(Long id);
    ReportDTO updateById(ReportDTO product);
    ReportDTO deleteById(Long id);
    List<ReportDTO> selectByName(String name);
}
