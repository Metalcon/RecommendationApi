package de.metalcon.recommendation.api.requests;

import de.metalcon.api.requests.Request;
import de.metalcon.domain.Muid;
import de.metalcon.domain.UidType;

public class GetRecommendationRequest extends Request {

    private Muid requestedMuid;

    private UidType uidTypeOfRecommendations;

    public GetRecommendationRequest(
            Muid forMuid,
            UidType uidTypeOfRecommendations) {
        requestedMuid = forMuid;
        this.uidTypeOfRecommendations = uidTypeOfRecommendations;
    }

    public Muid getRequestedMuid() {
        return requestedMuid;
    }

    public UidType getUidTypeOfRecommendations() {
        return uidTypeOfRecommendations;
    }

}
