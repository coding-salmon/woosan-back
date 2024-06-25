package com.luckyvicky.woosan.domain.board.dto;

import com.luckyvicky.woosan.domain.member.dto.MemberDTO;
import lombok.*;

import java.time.LocalDateTime;
import java.util.List;

@Data
@Builder
@AllArgsConstructor
@NoArgsConstructor
public class ReplyDTO {
    private Long id;  // 댓글 고유번호
    private Long boardId;  // 게시글 고유번호
    private String content;  // 내용
    private MemberDTO writer;  // 작성자 정보
    private LocalDateTime regDate;  // 작성 날짜
    private Long parentId;  // 부모 댓글의 고유번호

    private List<ReplyDTO> children;  // 자식 댓글 리스트

}
