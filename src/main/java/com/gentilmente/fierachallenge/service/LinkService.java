package com.gentilmente.fierachallenge.service;

import com.gentilmente.fierachallenge.repository.LinkRepository;
import com.gentilmente.fierachallenge.domain.Link;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class LinkService {

  @Autowired
  private LinkRepository linkRepository;
  private Integer code = 0;
  
  public Link findById(Long id) throws Exception {
    Link link = linkRepository.findById(id).orElse(null);
    return link;
  }

  public String save(Link link) throws Exception {
    // populate obj
    link.setClicks(0);
    code++;
    link.setShortened("localhost:8080/l/"+ Integer.toString(code));

    linkRepository.save(link);

    String response = "{\n\t\"target\" : \"" + link.getUrl_target() + "\",\n\t"+
    "\"link\" : \"" + link.getShortened() + "\",\n\t" +
    "\"valid\" : true\n" +
    "}";
    return response;
  }

}
