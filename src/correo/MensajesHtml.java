
package correo;


public class MensajesHtml {
         public MensajesHtml(){}

         public String mensajeCodigo(String codigo){
    String mensajeCorreo="<!doctype html>\n" +
"<html >\n" +
"  <head>\n" +
"    <title>\n" +
"    </title>\n" +
"    <meta http-equiv=\"X-UA-Compatible\" content=\"IE=edge\">\n" +
"    <meta http-equiv=\"Content-Type\" content=\"text/html; charset=UTF-8\">\n" +
"    <meta name=\"viewport\" content=\"width=device-width, initial-scale=1\">\n" +
"    <style type=\"text/css\">\n" +
"      #outlook a{padding: 0;}\n" +
"      			.ReadMsgBody{width: 100%;}\n" +
"      			.ExternalClass{width: 100%;}\n" +
"      			.ExternalClass *{line-height: 100%;}\n" +
"      			body{margin: 0; padding: 0; -webkit-text-size-adjust: 100%; -ms-text-size-adjust: 100%;}\n" +
"      			table, td{border-collapse: collapse; mso-table-lspace: 0pt; mso-table-rspace: 0pt;}\n" +
"      			img{border: 0; height: auto; line-height: 100%; outline: none; text-decoration: none; -ms-interpolation-mode: bicubic;}\n" +
"      			p{display: block; margin: 13px 0;}\n" +
"    </style>\n" +
"    <!--[if !mso]><!-->\n" +
"    <style type=\"text/css\">\n" +
"      @media only screen and (max-width:480px) {\n" +
"      			  		@-ms-viewport {width: 320px;}\n" +
"      			  		@viewport {	width: 320px; }\n" +
"      				}\n" +
"    </style>\n" +
"    <!--<![endif]-->\n" +
"    <!--[if mso]> \n" +
"		<xml> \n" +
"			<o:OfficeDocumentSettings> \n" +
"				<o:AllowPNG/> \n" +
"				<o:PixelsPerInch>96</o:PixelsPerInch> \n" +
"			</o:OfficeDocumentSettings> \n" +
"		</xml>\n" +
"		<![endif]-->\n" +
"    <!--[if lte mso 11]> \n" +
"		<style type=\"text/css\"> \n" +
"			.outlook-group-fix{width:100% !important;}\n" +
"		</style>\n" +
"		<![endif]-->\n" +
"    <style type=\"text/css\">\n" +
"      @media only screen and (max-width:480px) {\n" +
"      \n" +
"      			  table.full-width-mobile { width: 100% !important; }\n" +
"      				td.full-width-mobile { width: auto !important; }\n" +
"      \n" +
"      }\n" +
"      @media only screen and (min-width:480px) {\n" +
"      .dys-column-per-100 {\n" +
"      	width: 100.000000% !important;\n" +
"      	max-width: 100.000000%;\n" +
"      }\n" +
"      }\n" +
"      @media only screen and (min-width:480px) {\n" +
"      .dys-column-per-100 {\n" +
"      	width: 100.000000% !important;\n" +
"      	max-width: 100.000000%;\n" +
"      }\n" +
"      }\n" +
"      @media only screen and (min-width:480px) {\n" +
"      .dys-column-per-100 {\n" +
"      	width: 100.000000% !important;\n" +
"      	max-width: 100.000000%;\n" +
"      }\n" +
"      }\n" +
"      @media only screen and (min-width:480px) {\n" +
"      .dys-column-per-100 {\n" +
"      	width: 100.000000% !important;\n" +
"      	max-width: 100.000000%;\n" +
"      }\n" +
"      }\n" +
"    </style>\n" +
"  </head>\n" +
"  <body>\n" +
"    <div>\n" +
"      <!--[if mso | IE]>\n" +
"<table align=\"center\" border=\"0\" cellpadding=\"0\" cellspacing=\"0\" style=\"width:600px;\" width=\"600\"><tr><td style=\"line-height:0px;font-size:0px;mso-line-height-rule:exactly;\">\n" +
"<![endif]-->\n" +
"      <div style='margin:0px auto;max-width:600px;'>\n" +
"        <table align='center' border='0' cellpadding='0' cellspacing='0' role='presentation' style='width:100%;'>\n" +
"          <tbody>\n" +
"            <tr>\n" +
"              <td style='direction:ltr;font-size:0px;padding:20px 0;text-align:center;vertical-align:top;'>\n" +
"                <!--[if mso | IE]>\n" +
"<table role=\"presentation\" border=\"0\" cellpadding=\"0\" cellspacing=\"0\"><tr><td style=\"vertical-align:top;width:600px;\">\n" +
"<![endif]-->\n" +
"                <div class='dys-column-per-100 outlook-group-fix' style='direction:ltr;display:inline-block;font-size:13px;text-align:left;vertical-align:top;width:100%;'>\n" +
"                  <table border='0' cellpadding='0' cellspacing='0' role='presentation' style='vertical-align:top;' width='100%'>\n" +
"                    <tr>\n" +
"                      <td align='center' style='font-size:0px;padding:10px 25px;word-break:break-word;'>\n" +
"                        <table border='0' cellpadding='0' cellspacing='0' role='presentation' style='border-collapse:collapse;border-spacing:0px;'>\n" +
"                          <tbody>\n" +
"                            <tr>\n" +
"                              <td style='width:333px;'>\n" +
"                                <img alt='Welcome!' height='303' src='https://www.sendwithus.com/assets/img/emailmonks/images/banner.jpg' style='border:0;display:block;font-size:13px;height:303px;outline:none;text-decoration:none;width:100%;' width='333' />\n" +
"                              </td>\n" +
"                            </tr>\n" +
"                          </tbody>\n" +
"                        </table>\n" +
"                      </td>\n" +
"                    </tr>\n" +
"                  </table>\n" +
"                </div>\n" +
"                <!--[if mso | IE]>\n" +
"</td></tr></table>\n" +
"<![endif]-->\n" +
"              </td>\n" +
"            </tr>\n" +
"          </tbody>\n" +
"        </table>\n" +
"      </div>\n" +
"      <!--[if mso | IE]>\n" +
"</td></tr></table>\n" +
"<![endif]-->\n" +
"      <!--[if mso | IE]>\n" +
"<table align=\"center\" border=\"0\" cellpadding=\"0\" cellspacing=\"0\" style=\"width:600px;\" width=\"600\"><tr><td style=\"line-height:0px;font-size:0px;mso-line-height-rule:exactly;\">\n" +
"<![endif]-->\n" +
"      <div style='margin:0px auto;max-width:600px;'>\n" +
"        <table align='center' border='0' cellpadding='0' cellspacing='0' role='presentation' style='width:100%;'>\n" +
"          <tbody>\n" +
"            <tr>\n" +
"              <td style='direction:ltr;font-size:0px;padding:20px 0;text-align:center;vertical-align:top;'>\n" +
"                <!--[if mso | IE]>\n" +
"<table role=\"presentation\" border=\"0\" cellpadding=\"0\" cellspacing=\"0\"><tr><td style=\"vertical-align:top;width:600px;\">\n" +
"<![endif]-->\n" +
"                <div class='dys-column-per-100 outlook-group-fix' style='direction:ltr;display:inline-block;font-size:13px;text-align:left;vertical-align:top;width:100%;'>\n" +
"                  <table border='0' cellpadding='0' cellspacing='0' role='presentation' style='vertical-align:top;' width='100%'>\n" +
"                    <tr>\n" +
"                      <td align='center' style='font-size:0px;padding:10px 25px;word-break:break-word;' vertical-align='middle'>\n" +
"                        <table border='0' cellpadding='0' cellspacing='0' role='presentation' style='border-collapse:separate;line-height:100%;width:210px;'>\n" +
"                          <tr>\n" +
"                            <td align='center' bgcolor='#feae39' role='presentation' style='background-color:#feae39;border:none;border-radius:3px;cursor:auto;height:35px;padding:10px 25px;' valign='middle'>\n" +
"                              <p  style='background:#feae39;color:#080808;font-family:Open Sans, Arial, sans-serif;font-size:22px;font-weight:bold;line-height:120%;margin:0;text-decoration:none;text-transform:uppercase;' target='_blank'>\n" +
"                                "+codigo+"\n" +
"                              </p>\n" +
"                            </td>\n" +
"                          </tr>\n" +
"                        </table>\n" +
"                      </td>\n" +
"                    </tr>\n" +
"                  </table>\n" +
"                </div>\n" +
"                <!--[if mso | IE]>\n" +
"</td></tr></table>\n" +
"<![endif]-->\n" +
"              </td>\n" +
"            </tr>\n" +
"          </tbody>\n" +
"        </table>\n" +
"      </div>\n" +
"      <!--[if mso | IE]>\n" +
"</td></tr></table>\n" +
"<![endif]-->\n" +
"      <!--[if mso | IE]>\n" +
"<table align=\"center\" border=\"0\" cellpadding=\"0\" cellspacing=\"0\" style=\"width:600px;\" width=\"600\"><tr><td style=\"line-height:0px;font-size:0px;mso-line-height-rule:exactly;\">\n" +
"<![endif]-->\n" +
"      <div style='margin:0px auto;max-width:600px;'>\n" +
"        <table align='center' border='0' cellpadding='0' cellspacing='0' role='presentation' style='width:100%;'>\n" +
"          <tbody>\n" +
"            <tr>\n" +
"              <td style='direction:ltr;font-size:0px;padding:20px 0;text-align:center;vertical-align:top;'>\n" +
"                <!--[if mso | IE]>\n" +
"<table role=\"presentation\" border=\"0\" cellpadding=\"0\" cellspacing=\"0\"><tr><td style=\"vertical-align:top;width:600px;\">\n" +
"<![endif]-->\n" +
"                <div class='dys-column-per-100 outlook-group-fix' style='direction:ltr;display:inline-block;font-size:13px;text-align:left;vertical-align:top;width:100%;'>\n" +
"                  <table border='0' cellpadding='0' cellspacing='0' role='presentation' style='vertical-align:top;' width='100%'>\n" +
"                    <tr>\n" +
"                      <td align='center' style='font-size:0px;padding:10px 25px;word-break:break-word;'>\n" +
"                        <div style='color:#feae39;font-family:Open Sans, Arial, sans-serif;font-size:18px;font-weight:bold;line-height:20px;text-align:center;text-transform:uppercase;'>\n" +
"                          Copia tu codigo de verificacion\n" +
"                        </div>\n" +
"                      </td>\n" +
"                    </tr>\n" +
"                    <tr>\n" +
"                      <td align='center' style='font-size:0px;padding:10px 25px;padding-top:20px;word-break:break-word;'>\n" +
"                        <div style='color:#feae39;font-family:Courier New, Arial, sans-serif;font-size:50px;line-height:50px;text-align:center;text-transform:uppercase;'>\n" +
"                          Que tengas un buen dia.\n" +
"                        </div>\n" +
"                      </td>\n" +
"                    </tr>\n" +
"                  </table>\n" +
"                </div>\n" +
"                <!--[if mso | IE]>\n" +
"</td></tr></table>\n" +
"<![endif]-->\n" +
"              </td>\n" +
"            </tr>\n" +
"          </tbody>\n" +
"        </table>\n" +
"      </div>\n" +
"      <!--[if mso | IE]>\n" +
"</td></tr></table>\n" +
"<![endif]-->\n" +
"      <table align='center' border='0' cellpadding='0' cellspacing='0' role='presentation' style='background:#30373b;background-color:#30373b;width:100%;'>\n" +
"        <tbody>\n" +
"          <tr>\n" +
"            <td>\n" +
"              <div style='margin:0px auto;max-width:600px;'>\n" +
"                <table align='center' border='0' cellpadding='0' cellspacing='0' role='presentation' style='width:100%;'>\n" +
"                  <tbody>\n" +
"                    <tr>\n" +
"                      <td style='direction:ltr;font-size:0px;padding:2px;text-align:center;vertical-align:top;'>\n" +
"                        <!--[if mso | IE]>\n" +
"<table role=\"presentation\" border=\"0\" cellpadding=\"0\" cellspacing=\"0\"><tr><td style=\"vertical-align:top;width:600px;\">\n" +
"<![endif]-->\n" +
"                        <div class='dys-column-per-100 outlook-group-fix' style='direction:ltr;display:inline-block;font-size:13px;text-align:left;vertical-align:top;width:100%;'>\n" +
"                          <table border='0' cellpadding='0' cellspacing='0' role='presentation' width='100%'>\n" +
"                            <tbody>\n" +
"                              <tr>\n" +
"                                <td style='padding:10px;vertical-align:top;'>\n" +
"                                  <table border='0' cellpadding='0' cellspacing='0' role='presentation' style='' width='100%'>\n" +
"                                    <!-- Social Icons -->\n" +
"                                    <tr>\n" +
"                                      <td align='left' style='font-size:0px;padding:10px 25px;word-break:break-word;'>\n" +
"                                        <table border='0' cellpadding='0' cellspacing='0' style='cellpadding:0;cellspacing:0;color:#000000;font-family:Helvetica, Arial, sans-serif;font-size:13px;line-height:22px;table-layout:auto;width:100%;' width='100%'>\n" +
"                                          <tr>\n" +
"                                            <td align='center' valign='top'>\n" +
"                                              <table align='center' border='0' cellpadding='0' cellspacing='0'>\n" +
"                                                <tr>\n" +
"                                                  <td valign='top'>\n" +
"                                                    <a href='# Facebook' style='text-decoration:none;' target='_blank'>\n" +
"                                                      <img alt='Facebook' border='0' height='26' src='https://www.sendwithus.com/assets/img/emailmonks/images/fb.png' style='display:block;font-family: Arial, sans-serif; font-size:10px; line-height:18px; color:#feae39; ' width='26' />\n" +
"                                                    </a>\n" +
"                                                  </td>\n" +
"                                                  <td width='7'>\n" +
"                                                    &nbsp;\n" +
"                                                  </td>\n" +
"                                                  <td valign='top'>\n" +
"                                                    <a href='# Twitter' style='text-decoration:none;' target='_blank'>\n" +
"                                                      <img alt='Twitter' border='0' height='26' src='https://www.sendwithus.com/assets/img/emailmonks/images/tw.png' style='display:block;font-family: Arial, sans-serif; font-size:10px; line-height:18px; color:#feae39; ' width='26' />\n" +
"                                                    </a>\n" +
"                                                  </td>\n" +
"                                                  <td width='7'>\n" +
"                                                    &nbsp;\n" +
"                                                  </td>\n" +
"                                                  <td valign='top'>\n" +
"                                                    <a href='# Pinterest' style='text-decoration:none;' target='_blank'>\n" +
"                                                      <img alt='Pinterest' border='0' height='26' src='https://www.sendwithus.com/assets/img/emailmonks/images/pint.png' style='display:block;font-family: Arial, sans-serif; font-size:10px; line-height:18px; color:#feae39; ' width='26' />\n" +
"                                                    </a>\n" +
"                                                  </td>\n" +
"                                                  <td width='7'>\n" +
"                                                    &nbsp;\n" +
"                                                  </td>\n" +
"                                                  <td valign='top'>\n" +
"                                                    <a href='# Instagram' style='text-decoration:none;' target='_blank'>\n" +
"                                                      <img alt='Instagram' border='0' height='26' src='https://www.sendwithus.com/assets/img/emailmonks/images/insta.png' style='display:block;font-family: Arial, sans-serif; font-size:10px; line-height:18px; color:#feae39; ' width='26' />\n" +
"                                                    </a>\n" +
"                                                  </td>\n" +
"                                                  <td width='7'>\n" +
"                                                    &nbsp;\n" +
"                                                  </td>\n" +
"                                                  <td valign='top'>\n" +
"                                                    <a href='# Youtube' style='text-decoration:none;' target='_blank'>\n" +
"                                                      <img alt='Youtube' border='0' height='26' src='https://www.sendwithus.com/assets/img/emailmonks/images/yt.png' style='display:block;font-family: Arial, sans-serif; font-size:10px; line-height:18px; color:#feae39; ' width='26' />\n" +
"                                                    </a>\n" +
"                                                  </td>\n" +
"                                                </tr>\n" +
"                                              </table>\n" +
"                                            </td>\n" +
"                                          </tr>\n" +
"                                        </table>\n" +
"                                      </td>\n" +
"                                    </tr>\n" +
"                                    <!-- End Social Icons -->\n" +
"                                    <!-- Footer Content -->\n" +
"                                    <tr>\n" +
"                                      <td align='center' style='font-size:0px;padding:5px;word-break:break-word;'>\n" +
"                                        <div style='color:#848789;font-family:Open Sans, Arial, sans-serif;font-size:12px;line-height:18px;text-align:center;text-transform:uppercase;'>\n" +
"                                          <a href='# Privacy' style='text-decoration:underline; color:#848789;' target='_blank'>\n" +
"                                            PRIVACY STATEMENT\n" +
"                                          </a>\n" +
"                                          &nbsp;&nbsp;|&nbsp;&nbsp;\n" +
"                                          <a href='# TOS' style='text-decoration:underline; color:#848789;' target='_blank'>\n" +
"                                            TERMS OF SERVICE\n" +
"                                          </a>\n" +
"                                          &nbsp;&nbsp;|&nbsp;&nbsp;\n" +
"                                          <a href='# Returns' style='text-decoration:underline; color:#848789;' target='_blank'>\n" +
"                                            RETURNS\n" +
"                                          </a>\n" +
"                                        </div>\n" +
"                                      </td>\n" +
"                                    </tr>\n" +
"                                    <tr>\n" +
"                                      <td align='center' style='font-size:0px;padding:5px;word-break:break-word;'>\n" +
"                                        <div style='color:#848789;font-family:Open Sans, Arial, sans-serif;font-size:12px;line-height:18px;text-align:center;text-transform:uppercase;'>\n" +
"                                          ©2‌019 company name. All Rights Reserved.\n" +
"                                        </div>\n" +
"                                      </td>\n" +
"                                    </tr>\n" +
"                                    <tr>\n" +
"                                      <td align='center' style='font-size:0px;padding:5px;word-break:break-word;'>\n" +
"                                        <div style='color:#848789;font-family:Open Sans, Arial, sans-serif;font-size:12px;line-height:18px;text-align:center;text-transform:uppercase;'>\n" +
"                                          If you do not wish to receive any further emails from us, please\n" +
"                                          <span style='text-decoration:underline;'>\n" +
"                                            <a href='#' style='text-decoration:underline; color:#848789;' target='_blank'>\n" +
"                                              unsubscribe\n" +
"                                            </a>\n" +
"                                          </span>\n" +
"                                        </div>\n" +
"                                      </td>\n" +
"                                    </tr>\n" +
"                                    <!-- End Footer Content -->\n" +
"                                  </table>\n" +
"                                </td>\n" +
"                              </tr>\n" +
"                            </tbody>\n" +
"                          </table>\n" +
"                        </div>\n" +
"                        <!--[if mso | IE]>\n" +
"</td></tr></table>\n" +
"<![endif]-->\n" +
"                      </td>\n" +
"                    </tr>\n" +
"                  </tbody>\n" +
"                </table>\n" +
"              </div>\n" +
"            </td>\n" +
"          </tr>\n" +
"        </tbody>\n" +
"      </table>\n" +
"    </div>\n" +
"  </body>\n" +
"</html>";
    return mensajeCorreo;
    }

         
}
