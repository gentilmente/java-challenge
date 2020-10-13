package com.gentilmente.fierachallenge.service;

import com.gentilmente.fierachallenge.repository.LinkRepository;
import com.gentilmente.fierachallenge.domain.Link;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class LinkService {

  @Autowired
  private LinkRepository linkRepository;

  public Link findById(Long id) throws Exception {
    Link link = linkRepository.findById(id).orElse(null);
    return link;
  }

  public Link save(Link link) throws Exception {
    return linkRepository.save(link);
  }

}
