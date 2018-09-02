package br.com.moriya.negocio;

import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.Persistence;

import org.junit.After;
import org.junit.AfterClass;
import org.junit.Before;
import org.junit.BeforeClass;
import org.junit.Test;

import br.com.moriya.base.ProdutoDAO;
import br.com.moriya.modelo.EnumTipoProduto;
import br.com.moriya.modelo.Produto;
import lombok.Cleanup;

public class ProdutoDAOTest {
	
	@BeforeClass
    public static void setUpClass() {
    }

    @AfterClass
    public static void tearDownClass() {
    }

    @Before
    public void setUp() {
    }

    @After
    public void tearDown() {
    }

  @Test
  public void example() {
  }
    
//  @Test
  public void mainTest() {
	  
	  @Cleanup
      final EntityManagerFactory entityManagerFactory = Persistence.createEntityManagerFactory("databaseDefault");

      @Cleanup
      final EntityManager entityManager = entityManagerFactory.createEntityManager();
      entityManager.getTransaction().begin();
//
      Produto prod = new Produto();    
      ProdutoDAO dao = new ProdutoDAO(entityManager);
      final String PREFIXO = "tmp/";
      
//      
      prod.setSrcImagem(PREFIXO+"copoMoriyah.png");
      prod.setSrcImagemModal(PREFIXO+"copoMoriyahMODAL.png");
      prod.setTitulo("Nossas delícias");
      prod.setDescritivo("Venha conferir");
      prod.setTipo(EnumTipoProduto.PRODUTO_DESTAQUE.getTipo());
      dao.insert(prod);      
      
      Produto prod2 = new Produto();   
      
      prod2.setSrcImagem(PREFIXO+"barcaMulher.png");
      prod2.setSrcImagemModal(PREFIXO+"barcaMulherMODAL.png");
      prod2.setTitulo("Barca Moriyah");
      prod2.setDescritivo("Especialidade");
      prod2.setTipo(EnumTipoProduto.PRODUTO_DESTAQUE.getTipo());
      dao.insert(prod2);      
////      
      Produto prod3 = new Produto();   
      
      prod3.setSrcImagem(PREFIXO+"lojaMoriya.png");
      prod3.setSrcImagemModal(PREFIXO+"lojaMoriyaMODAL.png");
      prod3.setTitulo("Nossa casa, sua casa!");
      prod3.setDescritivo("Estamos lhe esperando.");
      prod3.setTipo(EnumTipoProduto.PRODUTO_DESTAQUE.getTipo());
      dao.insert(prod3);
//      
      Produto prod4 = new Produto();   
      
      prod4.setSrcImagem(PREFIXO+"acai64.png");
      prod4.setSrcImagemModal(PREFIXO+"acai64MODAL.png");
      prod4.setTitulo("Açai com adicionais");
      prod4.setDescritivo("De sua preferência");
      prod4.setTipo(EnumTipoProduto.PRODUTO_DESTAQUE.getTipo());
      dao.insert(prod4);
//      
      Produto prod5 = new Produto();   
      
      prod5.setSrcImagem(PREFIXO+"meninaAcai.png");
      prod5.setSrcImagemModal(PREFIXO+"meninaAcaiMODAL.png");
      prod5.setTitulo("Alegria da meninada");
      prod5.setDescritivo("Sucesso para as crianças");
      prod5.setTipo(EnumTipoProduto.PRODUTO_DESTAQUE.getTipo());
      dao.insert(prod5);
//      
//      Produto prod6 = new Produto();   
//      
//      prod6.setSrcImagem(PREFIXO+"img-286x215-6.jpg");
//      prod6.setSrcImagemModal(PREFIXO+"img-640x480-6.jpg");
//      prod6.setTitulo("Produto 06");
//      prod6.setDescritivo("Descritivo 06");
//      prod6.setTipo(EnumTipoProduto.PRODUTO_DESTAQUE.getTipo());
//      dao.insert(prod6);
//      
//      Produto prod7 = new Produto();   
//      
//      prod7.setSrcImagem(PREFIXO+"img-286x215-7.jpg");
//      prod7.setTitulo("Produto 07");
//      prod7.setDescritivo("Descritivo 07");
//      prod7.setTipo(EnumTipoProduto.PRODUTO_LANCAMENTO.getTipo());
//      dao.insert(prod7);
//      
//      Produto prod8 = new Produto();   
//      
//      prod8.setSrcImagem(PREFIXO+"img-286x215-8.jpg");
//      prod8.setTitulo("Produto 08");
//      prod8.setDescritivo("Descritivo 08");
//      prod8.setTipo(EnumTipoProduto.PRODUTO_LANCAMENTO.getTipo());
//      dao.insert(prod8);
//      
//      
//      Produto prod9 = new Produto();   
//      
//      prod9.setSrcImagem(PREFIXO+"img-286x215-9.jpg");
//      prod9.setTitulo("Produto 09");
//      prod9.setDescritivo("Descritivo 09");
//      prod9.setTipo(EnumTipoProduto.PRODUTO_LANCAMENTO.getTipo());
//      dao.insert(prod9);
//      
      entityManager.getTransaction().commit();
  }
  
}
