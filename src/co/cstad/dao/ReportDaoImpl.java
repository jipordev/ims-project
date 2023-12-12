package co.cstad.dao;

import co.cstad.model.ReportDTO;

import java.util.List;
import java.util.Optional;

public class ReportDaoImpl implements ReportDao{
    @Override
    public ReportDTO insert(ReportDTO report) {
        return null;
    }

    @Override
    public List<ReportDTO> select() {
        return null;
    }

    @Override
    public Optional<ReportDTO> selectByid(Long id) {
        return Optional.empty();
    }

    @Override
    public ReportDTO updateById(ReportDTO product) {
        return null;
    }

    @Override
    public ReportDTO deleteById(Long id) {
        return null;
    }

    @Override
    public List<ReportDTO> selectByName(String name) {
        return null;
    }
}
