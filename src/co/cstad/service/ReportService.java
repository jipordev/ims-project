package co.cstad.service;

import co.cstad.model.ReportDTO;

import java.util.List;

public interface ReportService {
    ReportDTO insert(ReportDTO report);
    List<ReportDTO> select();
    ReportDTO selectById(Long id);
    ReportDTO updateById(ReportDTO report);
    ReportDTO deleteById(Long id);
    List<ReportDTO> selectByName(String name);
}
