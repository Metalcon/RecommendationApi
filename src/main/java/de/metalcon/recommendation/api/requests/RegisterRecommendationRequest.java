package de.metalcon.recommendation.api.requests;

import de.metalcon.domain.Muid;
import de.metalcon.recommendation.api.RecommendationRequest;

public class RegisterRecommendationRequest extends RecommendationRequest {

    private static final long serialVersionUID = 8964763585999828352L;

    private Muid fromEntity;

    private Muid toEntity;

    private Integer score;

    /**
     * registers a recommendation in the recommendation engine. higher scores
     * mean closer relationships
     * 
     * @param from
     * @param to
     * @param score
     */
    public RegisterRecommendationRequest(
            Muid from,
            Muid to,
            Integer score) {
        fromEntity = from;
        toEntity = to;
        this.score = score;
    }

    public Muid getFromEntity() {
        return fromEntity;
    }

    public Muid getToEntity() {
        return toEntity;
    }

    public Integer getScore() {
        return score;
    }

}
