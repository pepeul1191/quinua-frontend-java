package controllers;

import play.mvc.*;
import org.json.JSONObject;
import com.j256.ormlite.dao.Dao;
import com.j256.ormlite.dao.DaoManager;
import com.j256.ormlite.stmt.PreparedQuery;
import com.j256.ormlite.stmt.QueryBuilder;
import com.j256.ormlite.support.ConnectionSource;
import java.util.ArrayList;
import java.util.List;

import configs.Conexion;
import models.Estacion;

public class EstacionController extends Controller {

    public Result listar() {
    		String rpta = "";

        try {
            Conexion conexion = new Conexion();
            ConnectionSource connectionSource = conexion.getConnectionSource();

            List<JSONObject> rptaTemp = new ArrayList<JSONObject>();
            Dao<Estacion, String> estacionDao = DaoManager.createDao(connectionSource, Estacion.class);
            QueryBuilder<Estacion, String> queryBuilder = estacionDao.queryBuilder();
            PreparedQuery<Estacion> preparedQuery = queryBuilder.prepare();
            List<Estacion> estacionList = estacionDao.query(preparedQuery);

            for (Estacion estacion : estacionList) {
                JSONObject obj = new JSONObject();
                obj.put("id", estacion.getId());
                obj.put("nombre", estacion.getNombre());
                obj.put("descripcion", estacion.getDescripcion());
                obj.put("latitud", estacion.getLatitud());
                obj.put("longitud", estacion.getLongitud());
                rptaTemp.add(obj);
            }

            rpta = rptaTemp.toString();
        } catch (Exception e) {
            //e.printStackTrace();
            JSONObject rptaTry = new JSONObject();
            rptaTry.put("tipo_mensaje", "error");
            String[] error = {"Se ha producido un error en  listar las estaciones registradas", e.toString()};
            rptaTry.put("mensaje", error);
            System.out.println( rptaTry.toString());
            rpta = rptaTry.toString();
            return ok(rpta).as("text/html; charset=utf-8");
        }
    	
    		return ok(rpta).as("text/html; charset=utf-8");
    }


}


