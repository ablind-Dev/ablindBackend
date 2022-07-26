package com.example.demo.dto.artist;

import com.example.demo.entity.artist.ArtistBoard;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.time.LocalDate;
import java.time.LocalDateTime;

@NoArgsConstructor
@Data
public class ArtistBoardDto {

    private Long boardId;

    private String title;

    private String content;

    private String email;

    private String creator;

    private LocalDateTime createdAt;

    private LocalDateTime updatedAt;

    @Builder
    public ArtistBoardDto(Long boardId, String title, String content, String email,
                          String creator, LocalDateTime createdAt, LocalDateTime updatedAt){
        this.boardId = boardId;
        this.title = title;
        this.content = content;
        this.email = email;
        this.creator = creator;
        this.createdAt = createdAt;
        this.updatedAt = updatedAt;
    }

    public ArtistBoardDto(String title, String content){
        this.title = title;
        this.content = content;
    }

    public ArtistBoardDto(ArtistBoard artistBoard){
        this.title = artistBoard.getTitle();
        this.content = artistBoard.getContent();
    }
}
