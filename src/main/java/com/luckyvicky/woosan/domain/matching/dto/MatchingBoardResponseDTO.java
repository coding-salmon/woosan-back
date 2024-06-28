package com.luckyvicky.woosan.domain.matching.dto;

import com.luckyvicky.woosan.domain.member.entity.MBTI;
import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Getter;
import lombok.NoArgsConstructor;

import java.math.BigDecimal;
import java.time.LocalDateTime;

@Getter
@Builder
@NoArgsConstructor
@AllArgsConstructor
public class MatchingBoardResponseDTO {

    //정기모임, 번개, 셀프소개팅 관련 공통 필드
    private Long id;
    private Long memberId;
    private Long managerId;
    private int matchingType;
    private String title;
    private String content;
    private String placeName;
    private BigDecimal locationX;
    private BigDecimal locationY;
    private String address;
    private LocalDateTime meetDate;
    private String tag;
    private int headCount;

    //셀프소개팅 관련 추가 필드
    private String location;
    private String introduce;
    private MBTI mbti;
    private String gender;
    private int age;
    private int height;
}
