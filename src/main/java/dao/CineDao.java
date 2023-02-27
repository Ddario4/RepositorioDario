package dao;

import java.util.ArrayList;
import java.util.List;

import bean.Cine;

public class CineDao {
	bd.Db db= new bd.Db("CineStar");





	public Object getPeliculas (boolean blista) {
		
		db.Sentencia(String.format("call sp_getCines()"));
		String [][] mRegistros = db.getRegistros();
		
		if(mRegistros==null) return null;
		if(!blista) return mRegistros ;
		
		List<Cine> lstCine =new ArrayList<>();
		for(String[] aRegistro :mRegistros)
			lstCine.add(new Cine(aRegistro));
		return lstCine;
		
	}

}
