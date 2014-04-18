package de.metalcon.recommendation.api.responses;

import java.util.List;

import de.metalcon.api.responses.SuccessResponse;
import de.metalcon.domain.Muid;

public class GetRecommendationResponse extends SuccessResponse {

    private static final long serialVersionUID = 2158929747474508595L;

    List<Muid> recommendations;

    List<Integer> scores;

    public GetRecommendationResponse(
            List<Muid> recommendations,
            List<Integer> scores) {
        this.recommendations = recommendations;
        this.scores = scores;
    }

    public List<Muid> getRecommendations() {
        return recommendations;
    }

    public List<Integer> getScores() {
        return scores;
    }

}
