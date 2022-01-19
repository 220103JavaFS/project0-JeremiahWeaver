package com.pzfc.repo;

import com.pzfc.models.Rookie;
import com.pzfc.utls.ConnectionUtil;

import java.sql.Connection;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.ArrayList;
import java.util.List;

public class RookieDAOImpl implements RookieDAO {
    @Override
    public List<Rookie> findRookieByID(int id) {
        List<Rookie> findRookie = findAllRookies();
        try (Connection connect = ConnectionUtil.getConnection()) {
            String sql = "SELECT * FROM rookie;";

            Statement statement = connect.createStatement();

            ResultSet results = statement.executeQuery(sql);

            List<Rookie> list = new ArrayList<>();

            while (results.next()) {

                String player_last_name = results.getString("player_last_name");
                int rookie_number = results.getInt("rookie_number");
                String rookie_team = results.getString("rookie_team");
                int draft_number = results.getInt("draft_number");
                int rookie_year = results.getInt("rookie_year");

                Rookie thisRook = new Rookie();
                findRookie.add(thisRook);

            }

            return list;

        } catch (SQLException e) {
            e.printStackTrace();
        }
        return findRookie;
    }
    
    @Override
    public boolean insertRookie(Rookie rook) {
        Rookie rookie = new Rookie();

        try (Connection connect = ConnectionUtil.getConnection()) {
        String sql = "SELECT * FROM rookie;";

        Statement statement = connect.createStatement();

        ResultSet results = statement.executeQuery(sql);

        List<Rookie> list = new ArrayList<>();

        while (results.next()) {

            String player_last_name = results.getString("player_last_name");
            int rookie_number = results.getInt("rookie_number");
            String rookie_team = results.getString("rookie_team");
            int draft_number = results.getInt("draft_number");
            int rookie_year = results.getInt("rookie_year");

            Rookie thisRook = new Rookie();
            rookie.add(thisRook);

        }

    } catch (SQLException e) {
        e.printStackTrace();
    }
        return false;
    }

    @Override
    public List<Rookie> findAllRookies() {
        List<Rookie> rookieList = new ArrayList<>();

        try (Connection connect = ConnectionUtil.getConnection()) {
            String sql = "SELECT * FROM rookie;";

            Statement statement = connect.createStatement();

            ResultSet results = statement.executeQuery(sql);

            List<Rookie> list = new ArrayList<>();

            while (results.next()) {

                String player_last_name = results.getString("player_last_name");
                int rookie_number = results.getInt("rookie_number");
                String rookie_team = results.getString("rookie_team");
                int draft_number = results.getInt("draft_number");
                int rookie_year = results.getInt("rookie_year");
                
                       Rookie thisRook = new Rookie();
                               rookieList.add(thisRook);

            }

            return list;

        } catch (SQLException e) {
            e.printStackTrace();
        }
        return rookieList;
    }
}