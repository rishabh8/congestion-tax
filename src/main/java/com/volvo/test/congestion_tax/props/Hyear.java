package com.volvo.test.congestion_tax.props;

import java.util.List;

import org.springframework.stereotype.Component;

import lombok.Getter;
import lombok.Setter;

@Component
@Getter
@Setter
public class Hyear {

    private int year;
    List<Hmonth> months;

}
