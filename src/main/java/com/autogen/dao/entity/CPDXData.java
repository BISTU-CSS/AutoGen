package com.autogen.dao.entity;

import com.deepoove.poi.data.NumberingRenderData;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@NoArgsConstructor
@AllArgsConstructor
public class CPDXData {
    private int index;
    private String name;
    private NumberingRenderData description;
}
