package entity;

import lombok.Data;

@Data
public class EventTracking {
    private Long userId;
    private Long articleId;
    private String ope;
}
