package com.solux.greenish.entity;

import jakarta.persistence.Entity;
import jakarta.persistence.Id;
import lombok.Data;
import org.hibernate.annotations.ColumnDefault;

//데이터베이스와 맵핑되는 객체
@Data
@Entity
public class Plant {
    @Id
    private String cntntsNo;
    private String rtnFileUrl;
    private String fruit;
    private String distbNm;
    private String dlthtsCodeNm;
    private String clCodeNm;
    private String fmlCodeNm;
    private String fmldecolrCodeNm;
    private String fmldeSeasonCodeNm;
    private String fncltyInfo;
    private String frtlzrInfo;
    private String growthAraInfo;
    private String growthHgInfo;
    private String grwhstleCodeNm;
    private String grwhTpCodeNm;
    private String grwtveCodeNm;
    private String hdCodeNm;
    private String ignSeasonCodeNm;
    private String lefcolrCodeNm;
    private String lefmrkCodeNm;
    private String lefStleInfo;
    private String lighttdemanddoCodeNm;
    private String managedemanddoCodeNm;
    private String managelevelCodeNm;
    private String orgplceInfo;
    private String flclrCodeNm;
    private String plntbneNm;
    private String plntzrNm;
    private String postngplaceCodeNm;
}
