package mountblueJobChallenge;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

// https://www.hackerrank.com/challenges/acm-icpc-team/problem
public class ACMICPCTeam {
    public static void main(String[] args) {
        System.out.println(acmTeam(Arrays.asList("10101", "11110", "00010")));
    }

    public static List<Integer> acmTeam(List<String> topic) {

        int maxTopics = 0;
        int maxTeams = 0;
        int attendees = topic.size();
        int topics = topic.get(0).length();

        for (int i = 0; i < attendees - 1; i++) {
            for (int j = i + 1; j < attendees; j++) {
                int knownTopics = 0;

                for (int k = 0; k < topics; k++) {
                    if (topic.get(i).charAt(k) == '1' || topic.get(j).charAt(k) == '1') {
                        knownTopics++;
                    }
                }

                if (knownTopics > maxTopics) {
                    maxTopics = knownTopics;
                    maxTeams = 1;
                } else if (knownTopics == maxTopics) {
                    maxTeams++;
                }
            }
        }

        List<Integer> result = new ArrayList<>();
        result.add(maxTopics);
        result.add(maxTeams);
        return result;
    }
}