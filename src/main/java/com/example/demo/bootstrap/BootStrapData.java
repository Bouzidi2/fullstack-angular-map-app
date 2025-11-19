package com.example.demo.bootstrap;

import com.example.demo.domain.OutsourcedPart;
import com.example.demo.domain.Part;
import com.example.demo.domain.Product;
import com.example.demo.repositories.OutsourcedPartRepository;
import com.example.demo.repositories.PartRepository;
import com.example.demo.repositories.ProductRepository;
import com.example.demo.service.OutsourcedPartService;
import com.example.demo.service.OutsourcedPartServiceImpl;
import com.example.demo.service.ProductService;
import com.example.demo.service.ProductServiceImpl;
import org.springframework.boot.CommandLineRunner;
import org.springframework.stereotype.Component;

import java.util.List;
import java.util.Optional;

/**
 *
 *
 *
 *
 */
@Component
public class BootStrapData implements CommandLineRunner {

    private final PartRepository partRepository;
    private final ProductRepository productRepository;

    private final OutsourcedPartRepository outsourcedPartRepository;

    public BootStrapData(PartRepository partRepository, ProductRepository productRepository, OutsourcedPartRepository outsourcedPartRepository) {
        this.partRepository = partRepository;
        this.productRepository = productRepository;
        this.outsourcedPartRepository=outsourcedPartRepository;
    }

    @Override
    public void run(String... args) throws Exception {

       /*
        OutsourcedPart o= new OutsourcedPart();
        o.setCompanyName("Western Governors University");
        o.setName("out test");
        o.setInv(5);
        o.setPrice(20.0);
        o.setId(100L);
        outsourcedPartRepository.save(o);
        OutsourcedPart thePart=null;
        List<OutsourcedPart> outsourcedParts=(List<OutsourcedPart>) outsourcedPartRepository.findAll();
        for(OutsourcedPart part:outsourcedParts){
            if(part.getName().equals("out test"))thePart=part;
        }

        System.out.println(thePart.getCompanyName());
        */
        outsourcedPartRepository.deleteAll();
        partRepository.deleteAll();
        productRepository.deleteAll();



        if (outsourcedPartRepository.count() == 0) {

            OutsourcedPart a = new OutsourcedPart();
            a.setCompanyName("Valley's Laptop Shop");
            a.setName("CPU");
            a.setInv(5);
            a.setPrice(150.00);
            a.setMinInv(1);
            a.setMaxInv(10);
            outsourcedPartRepository.save(a);

            OutsourcedPart b = new OutsourcedPart();
            b.setCompanyName("Valley's Laptop Shop");
            b.setName("CPU Cooler");
            b.setInv(15);
            b.setPrice(45.00);
            b.setMinInv(1);
            b.setMaxInv(20);
            outsourcedPartRepository.save(b);

            OutsourcedPart c = new OutsourcedPart();
            c.setCompanyName("Valley's Laptop Shop");
            c.setName("Motherboard");
            c.setInv(8);
            c.setPrice(180.00);
            c.setMinInv(1);
            c.setMaxInv(10);
            outsourcedPartRepository.save(c);

            OutsourcedPart d = new OutsourcedPart();
            d.setCompanyName("Valley's Laptop Shop");
            d.setName("Memory");
            d.setInv(30);
            d.setPrice(70.00);
            d.setMinInv(1);
            d.setMaxInv(35);
            outsourcedPartRepository.save(d);

            OutsourcedPart e = new OutsourcedPart();
            e.setCompanyName("Valley's Laptop Shop");
            e.setName("Storage");
            e.setInv(25);
            e.setPrice(90.00);
            e.setMinInv(1);
            e.setMaxInv(30);
            outsourcedPartRepository.save(e);
        }

        /*
        Product bicycle= new Product("bicycle",100.0,15);
        Product unicycle= new Product("unicycle",100.0,15);
        productRepository.save(bicycle);
        productRepository.save(unicycle);
        */

        Product businessLaptop = new Product("Business Laptop", 1200.00, 5);
        Product gamingLaptop = new Product("Gaming Laptop", 2000.00, 7);
        Product ruggedLaptop = new Product("Rugged Laptop", 1800.00, 4);
        Product workstationLaptop = new Product("Workstation Laptop", 2500.00, 3);
        Product ultraportables = new Product("Ultraportables", 999.00, 10);

        productRepository.save(businessLaptop);
        productRepository.save(gamingLaptop);
        productRepository.save(ruggedLaptop);
        productRepository.save(workstationLaptop);
        productRepository.save(ultraportables);



        System.out.println("Started in Bootstrap");
        System.out.println("Number of Products"+productRepository.count());
        System.out.println(productRepository.findAll());
        System.out.println("Number of Parts"+partRepository.count());
        System.out.println(partRepository.findAll());

    }
}
