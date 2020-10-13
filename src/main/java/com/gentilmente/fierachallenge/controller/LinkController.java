package com.gentilmente.fierachallenge.controller;

import java.sql.Timestamp;
import java.text.DateFormat;
import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Locale;
import javax.validation.Valid;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestHeader;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
import com.gentilmente.fierachallenge.domain.Link;
import com.gentilmente.fierachallenge.service.LinkService;

@RestController
@RequestMapping("/api")
public class LinkController {

  @Autowired
  private LinkService linkService;

  //curl {"url_target": "https://www.fiastudo.com", "expiration": "2020-10-18T00:00:00.000+00:00"}

  @PostMapping("/create")
  
  public ResponseEntity<String> create(@Valid @RequestBody Link link) throws Exception {
    link.setShortened("localhost:8080/l/asdasd");
    
    Link l = linkService.save(link);

    return ResponseEntity.ok(l.getShortened());

  }
}
