package com.power.likelion.dto.member;

import io.swagger.v3.oas.annotations.media.Schema;
import lombok.Getter;
import lombok.NoArgsConstructor;

@Getter
@NoArgsConstructor
public class MemberUpdateReq {
    @Schema(description = "닉네임", example = "김부자")
    private String nickname;

    @Schema(description = "이미지",example="https://ncp-bucket-user.kr.object.ncloudstorage.com/aiinfo/921193333073900.jpg")
    private String url;

}
