package uk.ac.man.cs.mig.coode.pizzafinder.selection;

/**
 * User: matthewhorridge<br>
 * The Univeristy Of Manchester<br>
 * Medical Informatics Group<br>
 * Date: Oct 6, 2004<br><br>
 * <p/>
 * matthew.horridge@cs.man.ac.uk<br>
 * www.cs.man.ac.uk/~horridgm<br><br>
 */
public interface Selectable {
	public Object getSelection();
	public void setSelection(Object obj);
	public void addSelectionListener(SelectionListener lsnr);
	public void removeSelectionListener(SelectionListener lsnr);
}
