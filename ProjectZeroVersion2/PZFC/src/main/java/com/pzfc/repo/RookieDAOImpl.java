package com.pzfc.repo;

import com.pzfc.models.Rookie;
import com.pzfc.utls.ConnectionUtil;

import java.sql.*;
import java.util.ArrayList;
import java.util.List;

public class RookieDAOImpl implements RookieDAO {
    @Override
    public List<Rookie> findRookieByID(int id) {
        List<Rookie> findRookie = findAllRookies();
        try (Connection connect = ConnectionUtil.getConnection()) {
            String sql = "SELECT * FROM rookie WHERE player_last_name = ?;";

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
        String sql = "INSERT INTO rookie (player_last_name, rookie_number, rookie_team, draft_number, rookie_year VALUES (?,?,?,?,?);";

       PreparedStatement statement = connect.prepareStatement(sql);

        int count = 0;
        statement.setString(++count, rookie.getPlayerLastName());
        statement.setInt(++count, rookie.getRookieNumber());
        statement.setString(++count, rookie.getRookieTeam());
        statement.setInt(++count, rookie.getDraftNumber());
        statement.setInt(++count, rookie.getRookieYear());

            statement.execute();

            return true;

    } catch (SQLException e) {
        e.printStackTrace();
    }
        return false;
    }

    @Override
    public List<Rookie> findAllRookies() {
        List<Rookie> rookieList = new ArrayList<>();

        try (Connection connect = ConnectionUtil.getConnection()) {
            String sql = "SELECT * FROM rookie WHERE rookie_number = ?;";

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