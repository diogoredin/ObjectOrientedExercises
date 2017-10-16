public class Loja extends Object {

	private int _vendas;
	private double _volume;
	private int _reclama;

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

	public void registaReclamacao () {
		_reclama ++;
	}

	public static void main (String [] args) {

		int i;
		Cliente [] cli = new Cliente[22];
		Loja loj = new Loja();

		for (i = 0; i < 22; i ++) {
			
			if ( i < 7 ) {
				String name = "XPTO" + (22+i)%22;
				cli[i] = new Cliente(name, loj);
			}

			else {
				String name = "XPTO" + (22+i)%22;
				cli[i] = new ClienteVip(name, loj);
			}

			System.out.println(cli[i].obtemNome());
			cli[i].obtemNome();
			cli[i].consultaCatalogo();
			cli[i].reclama();
			cli[i].compraProduto(15.0);

		}

	}
}