package Arboles;

import Pilas_Colas.ColaGenerica;

public class ArbolBinario<T> {
	private T dato;
	private ArbolBinario<T> hijoIzquierdo;   
	private ArbolBinario<T> hijoDerecho; 

	
	public ArbolBinario() {
		super();
	}

	public ArbolBinario(T dato) {
		this.dato = dato;
	}

	/*
	 * getters y setters
	 * 
	 */
	public T getDato() {
		return dato;
	}

	public void setDato(T dato) {
		this.dato = dato;
	}
	
	/**
	 * Preguntar antes de invocar si tieneHijoIzquierdo()
	 * @return
	 */
	public ArbolBinario<T> getHijoIzquierdo() {
		return this.hijoIzquierdo;
	}

	public ArbolBinario<T> getHijoDerecho() {
		return this.hijoDerecho;

	}

	public void agregarHijoIzquierdo(ArbolBinario<T> hijo) {
		this.hijoIzquierdo = hijo;
	}

	public void agregarHijoDerecho(ArbolBinario<T> hijo) {
		this.hijoDerecho = hijo;
	}

	public void eliminarHijoIzquierdo() {
		this.hijoIzquierdo = null;
	}

	public void eliminarHijoDerecho() {
		this.hijoDerecho = null;
	}

	public boolean esVacio() {
		return this.getDato() == null && !this.tieneHijoIzquierdo() && !this.tieneHijoDerecho();
	}

	public boolean esHoja() {
		return (!this.tieneHijoIzquierdo() && !this.tieneHijoDerecho());

	}

	@Override
	public String toString() {
		return this.getDato().toString();
	}

	 
	public boolean tieneHijoIzquierdo() {
		return this.hijoIzquierdo!=null;
	}

	 
	public boolean tieneHijoDerecho() {
		return this.hijoDerecho!=null;
	}
    
	public int contarHojas() {
            if (this.esVacio()) {
                return 0;
            }
            if (this.esHoja()) {
                return 1;
            }
            int cant= 0;
            if (this.tieneHijoDerecho()) {
                cant+= this.getHijoDerecho().contarHojas();
            }
            if (this.tieneHijoIzquierdo()) {
                cant+= this.getHijoIzquierdo().contarHojas();
            }
            return cant;
        }

        public ArbolBinario<T> espejo() {
            if (this.esVacio() || this.esHoja()) {
                return null;
            }
            ArbolBinario<T> aux = this.hijoDerecho;
            this.hijoDerecho = this.hijoIzquierdo;
            this.hijoIzquierdo = aux;
            if (this.tieneHijoDerecho()) {
                this.getHijoDerecho().espejo();
            }
            if (this.tieneHijoIzquierdo()) {
                this.getHijoIzquierdo().espejo();
            }
            return null;
	}
        
        public int altura () {
            if (this.esVacio() || this.esHoja()) {
                return 0;
            }
            int aux1 = 0;
            int aux2 = 0;
            if (this.tieneHijoIzquierdo()) {
                aux1 = 1 + this.getHijoIzquierdo().altura();
            }
            if (this.tieneHijoDerecho()) {
                aux2 = 1 + this.getHijoDerecho().altura();
            }
            if (aux1 > aux2) {
                return aux1;
            }
            else {
                return aux2;
            }
        }

	public void entreNiveles(int n, int m){
            ArbolBinario<T> arbol;
            ColaGenerica<ArbolBinario<T>> cola = new ColaGenerica<>();
            cola.encolar(this);
            cola.encolar(null);
            int nivel = 0;
            int altura = this.altura();
            while (!cola.esVacia() && 0 <= n && n < m && m <= altura && nivel >= n && nivel <= m) {
                arbol = cola.desencolar();
                if (arbol != null) {
                    System.out.println(arbol.getDato());
                    if (arbol.tieneHijoIzquierdo()) {
                        cola.encolar(arbol.getHijoIzquierdo());
                    }
                    if (arbol.tieneHijoDerecho()) {
                        cola.encolar(arbol.getHijoDerecho());
                    }
                }
                else if (!cola.esVacia()) {
                    System.out.println();
                    nivel += 1;
                    cola.encolar(null); 
                }
            }
	}
}
