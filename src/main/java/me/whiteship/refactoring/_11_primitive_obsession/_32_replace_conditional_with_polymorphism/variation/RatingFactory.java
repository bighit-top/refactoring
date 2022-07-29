package me.whiteship.refactoring._11_primitive_obsession._32_replace_conditional_with_polymorphism.variation;

import java.util.List;

public class RatingFactory {

    public static VoyageRating createRating(Voyage voyage, List<VoyageHistory> history) {
        VoyageRating voyageRating = new VoyageRating(voyage, history);
        if (voyage.zone().equals("china") && hasChinaHistory(history)) {
            voyageRating = new ChinaExperiencedVoyageRating(voyage, history);
        }
        return voyageRating;
    }

    private static boolean hasChinaHistory(List<VoyageHistory> history) {
        return history.stream().anyMatch(v -> v.zone().equals("china"));
    }
}
