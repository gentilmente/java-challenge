package com.gentilmente.fierachallenge.domain;

import java.io.Serializable;
import java.sql.Timestamp;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;
import lombok.Data;
import lombok.AllArgsConstructor;
import lombok.NoArgsConstructor;

@Data
@NoArgsConstructor
@AllArgsConstructor
@Entity
@Table(name = "link", schema = "public")
public class Link implements Serializable {
  private static final long serialVersionUID = 4048798961366546485L;
  @Id
  @GeneratedValue(strategy = GenerationType.IDENTITY)
  private Long id;
  private String url_target;
  private Timestamp expiration;
  private Integer clicks;
  private String shortened;
}
