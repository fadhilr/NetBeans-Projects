/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package tugas_ppp;

interface JatimParkVisitor {

    void visit(KomediPutar br);

    void visit(Gokart lb);

    void visit(KolamRenang kc);
}