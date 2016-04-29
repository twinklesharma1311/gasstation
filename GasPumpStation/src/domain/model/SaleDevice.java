package domain.model;

import ui.view.SaleDeviceDisplay;

public class SaleDevice {

    ReceiptPrinter printer;
    CardReader reader;
    SaleDeviceDisplay display;
    
	public ReceiptPrinter getPrinter() {
		return printer;
	}
	public void setPrinter(ReceiptPrinter printer) {
		this.printer = printer;
	}
	public CardReader getReader() {
		return reader;
	}
	public void setReader(CardReader reader) {
		this.reader = reader;
	}
	public SaleDeviceDisplay getDisplay() {
		return display;
	}
	public void setDisplay(SaleDeviceDisplay display) {
		this.display = display;
	}
}