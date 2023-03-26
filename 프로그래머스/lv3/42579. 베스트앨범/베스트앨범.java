import java.util.*;

class Solution {
    public int[] solution(String[] genres, int[] plays) {
        // 장르별 총 재생횟수를 저장할 HashMap
        HashMap<String, Integer> totalPlaysMap = new HashMap<>();
        // 장르별 노래 정보를 저장할 HashMap
        HashMap<String, ArrayList<Music>> musicMap = new HashMap<>();
        
        // 장르별 총 재생횟수와 노래 정보를 저장
        for(int i=0; i<genres.length; i++) {
            String genre = genres[i];
            int play = plays[i];
            
            // 총 재생횟수 갱신
            if(totalPlaysMap.containsKey(genre)) {
                totalPlaysMap.put(genre, totalPlaysMap.get(genre) + play);
            } else {
                totalPlaysMap.put(genre, play);
            }
            
            // 노래 정보 저장
            if(musicMap.containsKey(genre)) {
                ArrayList<Music> musicList = musicMap.get(genre);
                musicList.add(new Music(i, play));
            } else {
                ArrayList<Music> musicList = new ArrayList<>();
                musicList.add(new Music(i, play));
                musicMap.put(genre, musicList);
            }
        }
        
        // 재생횟수가 많은 장르 순서로 정렬
        List<Map.Entry<String, Integer>> totalPlaysList = new ArrayList<>(totalPlaysMap.entrySet());
        Collections.sort(totalPlaysList, new Comparator<Map.Entry<String, Integer>>() {
            public int compare(Map.Entry<String, Integer> obj1, Map.Entry<String, Integer> obj2) {
                return obj2.getValue().compareTo(obj1.getValue());
            }
        });
        
        // 장르별로 최대 2개까지 노래를 선택하여 answer 배열에 저장
        ArrayList<Integer> answerList = new ArrayList<>();
        for(Map.Entry<String, Integer> entry : totalPlaysList) {
            String genre = entry.getKey();
            ArrayList<Music> musicList = musicMap.get(genre);
            Collections.sort(musicList);
            
            // 최대 2개까지 노래 선택
            int count = 0;
            for(Music music : musicList) {
                if(count == 2) {
                    break;
                }
                answerList.add(music.id);
                count++;
            }
        }
        
        // answer 배열로 변환
        int[] answer = new int[answerList.size()];
        for(int i=0; i<answerList.size(); i++) {
            answer[i] = answerList.get(i);
        }
        return answer;
    }
    
    // 노래 정보를 저장할 클래스
    class Music implements Comparable<Music>{
        int id; // 고유 번호
        int play; // 재생횟수
        
        public Music(int id, int play) {
            this.id = id;
            this.play = play;
        }
        
        // 재생횟수가 많은 노래 순서로 정렬
        public int compareTo(Music o) {
            if(this.play == o.play) {
                return this.id - o.id;
            }
            return o.play - this.play;
        }
    }
}
