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
@ApiModel("personDto")
public class PersonDto {

    private Integer id;

    @ApiModelProperty("用户名")
    @NotBlank(message = "用户名不能为空")
    private String userName;

    @ApiModelProperty("密码")
    @NotBlank(message = "密码不能为空")
    private String password;
}
