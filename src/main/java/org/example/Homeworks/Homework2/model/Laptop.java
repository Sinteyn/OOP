package org.example.Homeworks.Homework2.model;

public class Laptop extends Product {
    private String manufacturer;
    private String model;
    private Double price;
    private String color;
    private Double screenDiagonal;
    private Boolean gaming;
    private String os;
    private String screenResolution;
    private String screenType;
    private String cpuModel;
    private Integer cpuCores;
    private Double cpuFrequency;
    private Integer ram;
    private Boolean ssd;
    private Integer rom;
    private String graphicsCard;

    public Laptop(String manufacturer, String model, Double price, String color, Double screenDiagonal, Boolean gaming,
                  String os, String screenResolution, String screenType, String cpuModel, Integer cpuCores,
                  Double cpuFrequency, Integer ram, Boolean ssd, Integer rom, String graphicsCard) {
        this.manufacturer = manufacturer;
        this.model = model;
        this.price = price;
        this.color = color;
        this.screenDiagonal = screenDiagonal;
        this.gaming = gaming;
        this.os = os;
        this.screenResolution = screenResolution;
        this.screenType = screenType;
        this.cpuModel = cpuModel;
        this.cpuCores = cpuCores;
        this.cpuFrequency = cpuFrequency;
        this.ram = ram;
        this.ssd = ssd;
        this.rom = rom;
        this.graphicsCard = graphicsCard;
    }


    public String getManufacturer() {
        return manufacturer;
    }

    public void setManufacturer(String manufacturer) {
        this.manufacturer = manufacturer;
    }

    public String getModel() {
        return model;
    }

    public void setModel(String model) {
        this.model = model;
    }

    public Double getPrice() {
        return price;
    }

    public void setPrice(Double price) {
        this.price = price;
    }

    public String getColor() {
        return color;
    }

    public void setColor(String color) {
        this.color = color;
    }

    public Double getScreenDiagonal() {
        return screenDiagonal;
    }

    public void setScreenDiagonal(Double screenDiagonal) {
        this.screenDiagonal = screenDiagonal;
    }

    public Boolean getGaming() {
        return gaming;
    }

    public void setGaming(Boolean gaming) {
        this.gaming = gaming;
    }

    public String getOs() {
        return os;
    }

    public void setOs(String os) {
        this.os = os;
    }

    public String getScreenResolution() {
        return screenResolution;
    }

    public void setScreenResolution(String screenResolution) {
        this.screenResolution = screenResolution;
    }

    public String getScreenType() {
        return screenType;
    }

    public void setScreenType(String screenType) {
        this.screenType = screenType;
    }

    public String getCpuModel() {
        return cpuModel;
    }

    public void setCpuModel(String cpuModel) {
        this.cpuModel = cpuModel;
    }

    public Integer getCpuCores() {
        return cpuCores;
    }

    public void setCpuCores(Integer cpuCores) {
        this.cpuCores = cpuCores;
    }

    public Double getCpuFrequency() {
        return cpuFrequency;
    }

    public void setCpuFrequency(Double cpuFrequency) {
        this.cpuFrequency = cpuFrequency;
    }

    public Integer getRam() {
        return ram;
    }

    public void setRam(Integer ram) {
        this.ram = ram;
    }

    public Boolean getSsd() {
        return ssd;
    }

    public void setSsd(Boolean ssd) {
        this.ssd = ssd;
    }

    public Integer getRom() {
        return rom;
    }

    public void setRom(Integer rom) {
        this.rom = rom;
    }

    public String getGraphicsCard() {
        return graphicsCard;
    }

    public void setGraphicsCard(String graphicsCard) {
        this.graphicsCard = graphicsCard;
    }

    @Override
    public String toString() {
        return "Ноутбук(" +
                "Производитель: " + manufacturer +
                ", Модель: " + model +
                ", Цена: " + price +
                ", Цвет: " + color +
                ", Диагональ экрана: " + screenDiagonal +
                ", Игровой: " + gaming +
                ", ОС: " + os +
                ", Разрешение экрана: " + screenResolution +
                ", Тип экрана: " + screenType +
                ", Процессор: " + cpuModel +
                ", Кол-во ядер процессора: " + cpuCores +
                ", Частота процессора: " + cpuFrequency +
                ", RAM: " + ram +
                ", SSD: " + ssd +
                ", ROM: " + rom +
                ", Видеокарта: " + graphicsCard +
                ')';
    }
}
