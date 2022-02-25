package com.ud8.entornos;

/**
 * <h1>Clase empleada para sacar la entrada de un blog, ejercicio de ED</h1>
 * @author aleix
 *
 */

public class EntradaBlogARC {
	//separador es el ccarácter que separa ENTRADA DE del
	//nombre del autor
	
	public static char separador=':';
	private int id;
	private String texto;
	private String autor;
	
	
	/**
	 * 
	 * @param id    <i>Id de la entrada</i>
	 * @param autor <i>Nombre del autor</i>
	 * @param texto <i>Texto introducido por el autor</i>
	 * @throws IllegalArgumentException
	 * 
	 * Constructor de la clase
	 */
	
	public EntradaBlogARC(int id,String autor,String texto)throws IllegalArgumentException{
		if(id<=0) throw new IllegalArgumentException("El id no puede ser negativo");
		this.id=id;
		this.autor=autor;
		this.texto=texto;
	}
	
	/**
	 * Sobreescrito el motodo toString para devolver valores al 
	 * hacer println sobre el objeto
	 */
	@Override
	public String toString(){
		String cad="";
		cad+="\nENTRADA DE"+separador+autor;
		cad+="\n "+texto;
		return cad;
	}
	
	
	/**
	 * 
	 * @return <ul>
	 * 				<li>el número de la entrada </li>
	 * 		   </ul>
	 */
	
	public int getId(){
		return this.id;
	}
	
	
	/**
	 * 
	 * @return <ul>
	 * 				<li> devuelve el texto completo de la entrada </li>
	 * 		   </ul>
	 */
	public String getTexto(){
		return this.texto;
	}
	
	/**
	 * 
	 * @return <ul>
	 * 				<li> devuelve el nombre del autor de la entrada en mayúsculas </li>
	 * 		   </ul>
	 */
	public String getAutor(){
		return this.autor.toUpperCase();
	}
	
	
	//devuelve el nombre del autor. Ya no se usa. Mejor ver getAutor
	/**
	 * 
	 * @deprecated 
	 */
	public String devuelveAutor(){
		return this.autor;
	}
	
	//No tiene porqué tener argumentos.
	public static void main(String[] args) {
                //Modificar.
		EntradaBlogARC e1=new EntradaBlogARC (3,"ana","Últimas noticias, está disponible BixBy 2.0");
		System.out.println(e1);
	}
}