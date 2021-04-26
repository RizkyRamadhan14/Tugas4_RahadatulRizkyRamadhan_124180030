package com.example.tugas4;

import java.util.ArrayList;

public class TeamData {
    private static String[] Title = new String[]{
      "Mercedes", "Redbull", "Mclaren", "Ferrari", "Alpha Tauri", "Aston Martin", "Alfa Romeo", "Alpine", "Williams", "Haas"
    };

    private static int[] Thumbnail = new int[]{
      R.drawable.mercedes, R.drawable.redbull, R.drawable.mclaren, R.drawable.ferrari, R.drawable.alphatauri,
            R.drawable.astonmartin, R.drawable.alfaromeo, R.drawable.alpine, R.drawable.williams, R.drawable.haas
    };

    public static ArrayList<TeamModel> getListData(){
        TeamModel teamModel = null;

        ArrayList<TeamModel> list = new ArrayList<>();

        for (int i = 0; i<Title.length; i++){
            teamModel = new TeamModel();
            teamModel.setLogoTeam(Thumbnail[i]);
            teamModel.setNamaTeam(Title[i]);
            list.add(teamModel);
        }
        return list;
    }
}
