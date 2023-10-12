package com.lms.admin.lwm.service;

import com.lms.admin.lwm.dto.LwmDto;
import com.lms.admin.lwm.mapper.LwmMapper;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
@RequiredArgsConstructor
public class LwmServiceImpl implements LwmService{

    private final LwmMapper lwmMapper;

    // 수업주차정보 전체 조회
    @Override
    public List<LwmDto> lwmSelectAll() {
        return lwmMapper.searchLwmList();
    }

    // 수업주차정보 선택 조회
    @Override
    public List<LwmDto> searchLwmByYearAndSemester(String lectureYear, int curriculumSemester) {
        return lwmMapper.searchLwmByYearAndSemester(lectureYear, curriculumSemester);
    }

}
