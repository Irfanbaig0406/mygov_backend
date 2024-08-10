package com.egov.service;

import java.util.List;

import com.egov.dto.WomenSchemeDto;

public interface IWomenService {

   List<WomenSchemeDto> getAllWomensData();
   WomenSchemeDto addNewWomenData(WomenSchemeDto womendto);
   WomenSchemeDto getWomenDataById(Integer id);
   WomenSchemeDto updateWomenDataDetails(Integer id, WomenSchemeDto womenDto);
   List<WomenSchemeDto> getWomenDataByName(String data);

}
