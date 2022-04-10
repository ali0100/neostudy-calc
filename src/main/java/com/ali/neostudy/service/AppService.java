package com.ali.neostudy.service;

import com.ali.neostudy.dto.CalcDto;
import com.ali.neostudy.entity.CalcEntity;

public interface AppService {

    CalcDto addition(CalcEntity entity);

    CalcDto subtraction(CalcEntity entity);

    CalcDto multiplication(CalcEntity entity);

    CalcDto division(CalcEntity entity);


}
