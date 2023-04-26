package com.IPL.data;
import com.IPL.Model.Match;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;





import org.springframework.batch.item.ItemProcessor;

import java.time.LocalDate;

public class MatchDataProcessor implements ItemProcessor<MatchInput, Match> {

        private static final Logger log = LoggerFactory.getLogger(PersonItemProcessor.class);

        @Override
        public Match process(final MatchInput matchInput) throws Exception {
               Match match = new Match();

                match.setiD( (long)  Integer.parseInt(matchInput.getID()));

                match.setCity(matchInput.getCity());

                match.setDate(LocalDate.parse(matchInput.getDate()));
                

            return match;
        }

    }
}
