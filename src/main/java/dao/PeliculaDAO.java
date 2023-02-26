package dao;

public class PeliculaDAO {
	bd.Db db= new bd.Db("CineStar");





	public Object getPeliculas (int id) {
		
		db.Sentencia(String.format("call sp_getPeliculas(%s)",id));
		return db.getRegistros();
	}

	/*

	public Object getPeliculas (int id,boolean blista) {
		
		db.Sentencia(String.format("call sp_getPeliculas(%s)",id));
		String [][] mRegistros = db.getRegistros();
		
		if(mRegistros==null) return null;
		if(!blista) return mRegistros ;
		List<Pelicula> lstPeliculas =new ArrayList<>();
		for(String[] aRegistro :mRegistros)
			lstPeliculas.add(new Pelicula(aRegistro));
		return lstPeliculas;
	}
	public Object getPelicula(String id, boolean bEntidad) {
		
		db.Sentencia(String.format("call sp_getPelicula(%s)",id));
		String [] aRegistro = db.getRegistro();
		
		if(aRegistro==null) return null;
		if(!bEntidad) return aRegistro ;

		return new Pelicula(aRegistro);
	}*/
}
