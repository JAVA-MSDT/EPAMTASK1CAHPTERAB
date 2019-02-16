package com.epam.javast.quadrilateral.repository;

import com.epam.javast.quadrilateral.repository.api.QuadrilateralSort;
import com.epam.javast.quadrilateral.repository.api.Repository;
import com.epam.javast.quadrilateral.repository.comparator.api.QuadrilateralComparator;
import com.epam.javast.quadrilateral.repository.specification.api.Specification;
import com.epam.javast.quadrilateral.entity.Quadrilateral;
import org.apache.log4j.Level;
import org.apache.log4j.LogManager;
import org.apache.log4j.Logger;

import java.util.ArrayList;
import java.util.List;

public class RepositoryImpl implements Repository, QuadrilateralSort {
    private static Logger logger = LogManager.getLogger(RepositoryImpl.class);
    private List<Quadrilateral> quadrilateralList;

    public RepositoryImpl(){
        quadrilateralList = new ArrayList<>();
    }

    public List<Quadrilateral> getQuadrilateralList(){
        return quadrilateralList;
    }

    @Override
    public void add(Quadrilateral quadrilateral) {
        if(quadrilateral == null){
            throw new IllegalArgumentException("It's not allow for a null value!!");
        }
        quadrilateralList.add(quadrilateral);

    }

    @Override
    public void add(Iterable<Quadrilateral> quadrilaterals) {
        if(quadrilaterals == null){
            throw new IllegalArgumentException("It's not allow for a null value!!");
        }
        for(Quadrilateral q : quadrilaterals){
            quadrilateralList.add(q);
        }
    }

    @Override
    public void remove(Quadrilateral quadrilateral) {
        if(quadrilateral == null){
            throw new IllegalArgumentException("It's not allow for a null value!!");
        }

        if(! quadrilateralList.contains(quadrilateral)){
            logger.log(Level.ERROR, "quadrilateral object not in the list");
        }

        quadrilateralList.remove(quadrilateral);
    }

    @Override
    public void remove(Specification specification) {
        if(specification == null){
            throw new IllegalArgumentException("It's not allow for a null value!!");
        }
        if(!quadrilateralList.isEmpty()){
            for(Quadrilateral q : quadrilateralList){
                if(specification.specified(q)){
                    quadrilateralList.remove(q);
                }
            }
        }

    }

    @Override
    public void update(Quadrilateral oldQuadrilateral, Quadrilateral newQuadrilateral) {
        if(oldQuadrilateral == null || newQuadrilateral == null){
            throw new IllegalArgumentException("It's not allow for a null value!!");
        }

        if(! quadrilateralList.contains(oldQuadrilateral)){
            logger.log(Level.ERROR, "quadrilateral object not in the list");
        }
        int quadrilateralIndex = quadrilateralList.indexOf(oldQuadrilateral);
        quadrilateralList.set(quadrilateralIndex, newQuadrilateral);



    }

    @Override
    public List<Quadrilateral> query(Specification specification) {
        if(specification == null){
            throw new IllegalArgumentException("It's not allow for a null value!!");
        }
        List<Quadrilateral> findingQuadrilateral = new ArrayList<>();

        if(!quadrilateralList.isEmpty()){
            for(Quadrilateral q : quadrilateralList){
                if(specification.specified(q)){
                    findingQuadrilateral.add(q);
                }
            }
        }
        return findingQuadrilateral;
    }

    @Override
    public void sort(Quadrilateral quadrilateral, QuadrilateralComparator compare) {
        for(int i = 0; i < quadrilateralList.size(); i++){
            for (int x = i; x < quadrilateralList.size(); x++){
                if(compare.compare(quadrilateralList.get(i), quadrilateralList.get(x)) > 0){
                    Quadrilateral o = quadrilateralList.get(x);
                    quadrilateralList.set(x, quadrilateralList.get(i));
                    quadrilateralList.set(i, o);


                }
            }
        }
    }
}
