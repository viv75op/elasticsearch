package com.lz.elasticsearch.dto;

import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;

import javax.validation.constraints.NotBlank;

/**
 * @author sy
 * @date 2020/01/16
 */

@Data
@Builder
@NoArgsConstructor
@AllArgsConstructor
@ApiModel("userDto")
public class UserDto {

    private Integer id;

    @ApiModelProperty("名字")
    @NotBlank(message = "名字不能为空")
    private String name;

    private String age;
}
