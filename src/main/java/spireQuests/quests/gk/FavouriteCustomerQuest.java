package spireQuests.quests.gk;

import com.megacrit.cardcrawl.relics.SmilingMask;
import spireQuests.patches.QuestTriggers;
import spireQuests.quests.AbstractQuest;
import spireQuests.quests.QuestReward;

public class FavouriteCustomerQuest extends AbstractQuest {
    public FavouriteCustomerQuest() {
        super(QuestType.LONG, QuestDifficulty.EASY);

        new TriggerTracker<>(QuestTriggers.MONEY_SPENT_AT_SHOP, 10)
                .add(this);

        addReward(new QuestReward.RelicReward(new SmilingMask()));
    }
}
