package org.apache.jsp.WEB_002dINF;

import javax.servlet.*;
import javax.servlet.http.*;
import javax.servlet.jsp.*;
import java.util.List;
import java.util.ArrayList;
import model.barangModel;

public final class edit_005fbarang_jsp extends org.apache.jasper.runtime.HttpJspBase
    implements org.apache.jasper.runtime.JspSourceDependent {

  private static final JspFactory _jspxFactory = JspFactory.getDefaultFactory();

  private static java.util.List<String> _jspx_dependants;

  private org.glassfish.jsp.api.ResourceInjector _jspx_resourceInjector;

  public java.util.List<String> getDependants() {
    return _jspx_dependants;
  }

  public void _jspService(HttpServletRequest request, HttpServletResponse response)
        throws java.io.IOException, ServletException {

    PageContext pageContext = null;
    HttpSession session = null;
    ServletContext application = null;
    ServletConfig config = null;
    JspWriter out = null;
    Object page = this;
    JspWriter _jspx_out = null;
    PageContext _jspx_page_context = null;

    try {
      response.setContentType("text/html;charset=UTF-8");
      pageContext = _jspxFactory.getPageContext(this, request, response,
      			null, true, 8192, true);
      _jspx_page_context = pageContext;
      application = pageContext.getServletContext();
      config = pageContext.getServletConfig();
      session = pageContext.getSession();
      out = pageContext.getOut();
      _jspx_out = out;
      _jspx_resourceInjector = (org.glassfish.jsp.api.ResourceInjector) application.getAttribute("com.sun.appserv.jsp.resource.injector");

      out.write("\n");
      out.write("\n");
      out.write("\n");
      out.write("\n");
      out.write("\n");
      out.write("\n");
      out.write("<!DOCTYPE html>\n");
      out.write("<html>\n");
      out.write("    <head>\n");
      out.write("        <meta http-equiv=\"Content-Type\" content=\"text/html; charset=UTF-8\">\n");
      out.write("        <title>Edit Barang</title>\n");
      out.write("         <link rel=\"stylesheet\" href=\"https://stackpath.bootstrapcdn.com/bootstrap/4.3.1/css/bootstrap.min.css\" integrity=\"sha384-ggOyR0iXCbMQv3Xipma34MD+dH/1fQ784/j6cY/iJTQUOhcWr7x9JvoRxT2MZw1T\" crossorigin=\"anonymous\">\n");
      out.write(" \n");
      out.write("    </head>\n");
      out.write("    <body>\n");
      out.write("        \n");
      out.write("        \n");
      out.write("       <nav class=\"navbar navbar-expand-lg navbar-dark bg-success\">\n");
      out.write("            <a class=\"navbar-brand\" href=\"#\">barang</a>\n");
      out.write("            <button class=\"navbar-toggler\" type=\"button\" data-toggle=\"collapse\" data-target=\"#navbarNav\" aria-controls=\"navbarNav\" aria-expanded=\"false\" aria-label=\"Toggle navigation\">\n");
      out.write("              <span class=\"navbar-toggler-icon\"></span>\n");
      out.write("            </button>\n");
      out.write("            <div class=\"collapse navbar-collapse\" id=\"navbarNav\">\n");
      out.write("              <ul class=\"navbar-nav\">\n");
      out.write("                <li class=\"nav-item\">\n");
      out.write("                  <a class=\"nav-link\" href=\"barangController?proses=menuutama\">Data Barang</a>\n");
      out.write("                </li>\n");
      out.write("                <li class=\"nav-item\">\n");
      out.write("                  <a class=\"nav-link\" href=\"penjualanController?proses=menupenjualan\">Penjualan</a>\n");
      out.write("                </li>           \n");
      out.write("              </ul>\n");
      out.write("            </div>\n");
      out.write("           </nav>\n");
      out.write(" \n");
      out.write("     <div class=\"container\">\n");
      out.write("        <h1>Edit Data</h1>\n");
      out.write("         ");

                String id = request.getParameter("id");
                barangModel km = new barangModel();
                km.setKodeBarang(id);
                List<barangModel> data = new ArrayList<barangModel>();
                data = km.cariKDBRG();
                if (data.size() > 0) {

            
      out.write("\n");
      out.write("        <form  action=\"barangController?data=barang&proses=edit-barang\" method=\"post\">\n");
      out.write("            <div class=\"form-group\">\n");
      out.write("              <label for=\"kodeBarang\">Kode Barang</label>\n");
      out.write("              <input type=\"text\" class=\"form-control\" id=\"kodebarang\" name=\"kode_barang\"  value=\"");
      out.print(data.get(0).getKodeBarang());
      out.write("\">\n");
      out.write("            </div>\n");
      out.write("            <div class=\"form-group\">\n");
      out.write("              <label for=\"namaBarang\">Nama Barang</label>\n");
      out.write("              <input type=\"text\" class=\"form-control\" name=\"nama_barang\" value=\"");
      out.print(data.get(0).getNamaBarang());
      out.write("\">\n");
      out.write("              <input type=\"hidden\" class=\"form-control\" name=\"id\" value=\"");
      out.print(data.get(0).getKodeBarang());
      out.write("\">\n");
      out.write("            </div>\n");
      out.write("             <div class=\"form-group\">\n");
      out.write("              <label for=\"hargaJual\">Harga Jual</label>\n");
      out.write("               <input type=\"text\" class=\"form-control\" name=\"harga_jual\" value=\"");
      out.print(data.get(0).getHargaJual());
      out.write("\">\n");
      out.write("              <input type=\"hidden\" class=\"form-control\" name=\"id\" value=\"");
      out.print(data.get(0).getKodeBarang());
      out.write("\">\n");
      out.write("            </div>\n");
      out.write("             <div class=\"form-group\">\n");
      out.write("              <label for=\"hargaBeli\">Harga Beli</label>\n");
      out.write("              <input type=\"text\" class=\"form-control\" name=\"harga_beli\" value=\"");
      out.print(data.get(0).getHargaBeli());
      out.write("\">\n");
      out.write("              <input type=\"hidden\" class=\"form-control\" name=\"id\" value=\"");
      out.print(data.get(0).getKodeBarang());
      out.write("\">\n");
      out.write("            </div>\n");
      out.write("            <div class=\"form-group\">\n");
      out.write("              <label for=\"satuan\">Satuan</label>\n");
      out.write("              <input type=\"text\" class=\"form-control\" name=\"satuan\" value=\"");
      out.print(data.get(0).getSatuan());
      out.write("\">\n");
      out.write("              <input type=\"hidden\" class=\"form-control\" name=\"id\" value=\"");
      out.print(data.get(0).getKodeBarang());
      out.write("\">\n");
      out.write("            </div>\n");
      out.write("            <div class=\"form-group\">\n");
      out.write("              <label for=\"kategori\">kategori</label>\n");
      out.write("              <input type=\"text\" class=\"form-control\" name=\"kategori\" value=\"");
      out.print(data.get(0).getKategori());
      out.write("\">\n");
      out.write("              <input type=\"hidden\" class=\"form-control\" name=\"id\" value=\"");
      out.print(data.get(0).getKodeBarang());
      out.write("\">\n");
      out.write("            </div>\n");
      out.write("             ");
}
      out.write("\n");
      out.write("            <button type=\"submit\" value=\"tambah\" class=\"btn btn-primary\">Ubah</button>\n");
      out.write("          </form>\n");
      out.write("        </div>\n");
      out.write("    </body>\n");
      out.write("    \n");
      out.write("<</html>\n");
    } catch (Throwable t) {
      if (!(t instanceof SkipPageException)){
        out = _jspx_out;
        if (out != null && out.getBufferSize() != 0)
          out.clearBuffer();
        if (_jspx_page_context != null) _jspx_page_context.handlePageException(t);
        else throw new ServletException(t);
      }
    } finally {
      _jspxFactory.releasePageContext(_jspx_page_context);
    }
  }
}
