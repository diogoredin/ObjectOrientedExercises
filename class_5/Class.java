public class Loja {

	private _vendas int;
	private _volume double;
	private _reclama int;

	public Loja () {
		_vendas = 0;
		_volume = 0; 
		_reclama = 0;
	}

	public int obtemNumeroVendas () {
		return _vendas;
	}

	public double obtemVolumeVendas () {
		return _volume;
	}

	public int obtemNumeroReclamacoes () {
		return _reclama;
	}

	public void registaVenda(double val) {
		_volume += val;
		_vendas ++;
	}

	public registaReclamacao () {
		_reclama ++;
	}

	public static void main (String [] args) {

		int i;
		Cliente[] cli = new Cliente [22];

		for (i = 0; i < 22; i ++) {
			cli[i] = new Cliente("XPTO" + (22+i)%22);
		}
	}
}