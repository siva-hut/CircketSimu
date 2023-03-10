package com.cricketApplication.dao.entities;

import jakarta.persistence.*;
import lombok.*;
import org.springframework.data.elasticsearch.annotations.Document;

@Entity
@Builder
@Setter
@Getter
@NoArgsConstructor
@AllArgsConstructor
@Document(indexName = "balldata")
public class BallDataDao {
    @org.springframework.data.annotation.Id
    @Id
    @GeneratedValue(strategy = GenerationType.SEQUENCE)
    @Column(name = "id", nullable = false)
    private Long id;
    private int innings;
    private float overs;
    private Long gameId;
    @ManyToOne(targetEntity = PlayerDao.class, fetch = FetchType.LAZY)
    @JoinColumn(name = "bowlerId", insertable = false, updatable = false)
    private PlayerDao bowler;
    @Column(name = "bowlerId")
    private Long bowlerId;
    @ManyToOne(targetEntity = PlayerDao.class, fetch = FetchType.LAZY)
    @JoinColumn(name = "batsmanId", insertable = false, updatable = false)
    private PlayerDao batsman;
    @Column(name = "batsmanId")
    private Long batsmanId;
    private char ballOutCome;
}
