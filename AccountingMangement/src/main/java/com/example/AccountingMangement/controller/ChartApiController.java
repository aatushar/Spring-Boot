package com.example.AccountingMangement.controller;

import com.example.AccountingMangement.model.Chart;
import com.example.AccountingMangement.service.ChartService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;
@RestController
@RequestMapping("/charts")
public class ChartApiController {




        @Autowired
        private ChartService service;

        @GetMapping("/")
        public ResponseEntity<List<Chart>> getAllCharts() {
            List<Chart> chartList = service.getAllChart();
            return new ResponseEntity<>(chartList, HttpStatus.OK);
        }

        @PostMapping("/add")
        public ResponseEntity<Chart> addChart(@RequestBody Chart chart) {
            service.save(chart);
            return new ResponseEntity<>(chart, HttpStatus.CREATED);
        }

        @DeleteMapping("/delete/{id}")
        public ResponseEntity<Void> deleteChart(@PathVariable int id) {
            service.deleteChart(id);
            return new ResponseEntity<>(HttpStatus.NO_CONTENT);
        }

        @PutMapping("/edit/{id}")
        public ResponseEntity<Chart> editChart(@PathVariable int id, @RequestBody Chart updatedChart) {
            Chart chart = service.editChart(id);
            if (chart != null) {
                updatedChart.setId(id);
                service.save(updatedChart);
                return new ResponseEntity<>(updatedChart, HttpStatus.OK);
            } else {
                return new ResponseEntity<>(HttpStatus.NOT_FOUND);
            }
        }
}
