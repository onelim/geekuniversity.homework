package ru.geekuniveersity.homework.j2.lesson3;

import java.util.*;

public class Main {
    public static void main(String[] args) {
        final List<String> words = Arrays.asList("несоизмеримый", "вздыбиться", "основоположение", "олива", "крякать", "пушкинский",
            "наклепывать", "трубоволочильный", "пушка", "крякать", "жигули", "оплот", "картина", "аптека", "кровь", "отвар", "амфетамин", "гроза", "смутенье", "зверьё", "ошибка", "витамины", "орел", "пинкод", "крякать", "заноза", "мандарин", "кофе", "витамин", "аптека", "основоположение", "олива", "крякать", "пушкинский", "наклепывать", "амфетамин", "гроза", "смутенье", "ошибка", "трубоволочильный", "пушка", "жигули", "оплот", "картина");
        
        System.out.println(words.size());
        
        final Set<String> uniqueWords = new HashSet<>(words);
        
        System.out.println(uniqueWords.toString());
        
        final Map<String, Integer> dups = new HashMap<>();
        
        for (String word : words) {
            if (dups.containsKey(word))
                dups.put(word, dups.get(word) + 1);
            else
                dups.put(word, 1);
            
        }
        
        System.out.println(dups);
    }
}
