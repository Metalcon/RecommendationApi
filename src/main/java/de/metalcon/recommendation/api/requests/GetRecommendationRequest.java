package de.metalcon.recommendation.api.requests;

import java.util.List;

import de.metalcon.domain.Muid;
import de.metalcon.domain.UidType;
import de.metalcon.recommendation.api.RecommendationRequest;

public class GetRecommendationRequest extends RecommendationRequest {

    private static final long serialVersionUID = -8169684007235983346L;

    private Muid requestedMuid;

    private UidType uidTypeOfRecommendations;

    private List<Muid> respectingInterests;

    private int numRecommendations;

    /**
     * Retrieves similar entities for forMuid. It can optionally be given a list
     * of interests that should be taken into consideration
     * 
     * @param forMuid
     *            entity for which similar entities should be retrieved
     * @param respectingInterests
     *            entities which should be taken into consideration. For example
     *            this could be the list of interests a user has to make the
     *            recommendations personalized. This argument can be null
     * @param uidTypeOfRecommendations
     *            typ of entities that are expected for the answer. If it is
     *            null all kind of entities will be returned
     * @param numRecommendations
     *            number of recommendations that will be retrieved
     */
    public GetRecommendationRequest(
            Muid forMuid,
            List<Muid> respectingInterests,
            UidType uidTypeOfRecommendations,
            int numRecommendations) {
        requestedMuid = forMuid;
        this.respectingInterests = respectingInterests;
        this.numRecommendations = numRecommendations;
        this.uidTypeOfRecommendations = uidTypeOfRecommendations;
    }

    public Muid getRequestedMuid() {
        return requestedMuid;
    }

    public UidType getUidTypeOfRecommendations() {
        return uidTypeOfRecommendations;
    }

    public int getNumRecommendations() {
        return numRecommendations;
    }

    public List<Muid> getRespectingInterests() {
        return respectingInterests;
    }

}
