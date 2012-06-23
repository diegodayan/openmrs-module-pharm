/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package org.openmrs.module.pharm;


//            CREATE TABLE `pharm_sequence_data` (
//            `sequence_name` varchar(100) NOT NULL,
//            `sequence_increment` int(11) unsigned NOT NULL DEFAULT '1',
//            `sequence_min_value` int(11) unsigned NOT NULL DEFAULT '1',
//            `sequence_max_value` bigint(20) unsigned NOT NULL DEFAULT '18446744073709551615',
//            `sequence_cur_value` bigint(20) unsigned DEFAULT '1',
//            `sequence_cycle` tinyint(1) NOT NULL DEFAULT '0',
//            PRIMARY KEY (`sequence_name`)
//            ) ENGINE=InnoDB DEFAULT CHARSET=utf8;
/**
 *
 * @author Yan
 */
public class SequenceData {
    
    private String sequenceName;
    private Integer sequenceIncrement;
    private Integer sequenceMinValue;
    private Integer sequenceMaxValue;
    private Integer sequenceCurValue;
    private Integer sequenceCycle;

    /**
     * @return the sequenceName
     */
    public String getSequenceName() {
        return sequenceName;
    }

    /**
     * @param sequenceName the sequenceName to set
     */
    public void setSequenceName(String sequenceName) {
        this.sequenceName = sequenceName;
    }

    /**
     * @return the sequenceIncrement
     */
    public Integer getSequenceIncrement() {
        return sequenceIncrement;
    }

    /**
     * @param sequenceIncrement the sequenceIncrement to set
     */
    public void setSequenceIncrement(Integer sequenceIncrement) {
        this.sequenceIncrement = sequenceIncrement;
    }

    /**
     * @return the sequenceMinValue
     */
    public Integer getSequenceMinValue() {
        return sequenceMinValue;
    }

    /**
     * @param sequenceMinValue the sequenceMinValue to set
     */
    public void setSequenceMinValue(Integer sequenceMinValue) {
        this.sequenceMinValue = sequenceMinValue;
    }

    /**
     * @return the sequenceMaxValue
     */
    public Integer getSequenceMaxValue() {
        return sequenceMaxValue;
    }

    /**
     * @param sequenceMaxValue the sequenceMaxValue to set
     */
    public void setSequenceMaxValue(Integer sequenceMaxValue) {
        this.sequenceMaxValue = sequenceMaxValue;
    }

    /**
     * @return the sequenceCurValue
     */
    public Integer getSequenceCurValue() {
        return sequenceCurValue;
    }

    /**
     * @param sequenceCurValue the sequenceCurValue to set
     */
    public void setSequenceCurValue(Integer sequenceCurValue) {
        this.sequenceCurValue = sequenceCurValue;
    }

    /**
     * @return the sequenceCycle
     */
    public Integer getSequenceCycle() {
        return sequenceCycle;
    }

    /**
     * @param sequenceCycle the sequenceCycle to set
     */
    public void setSequenceCycle(Integer sequenceCycle) {
        this.sequenceCycle = sequenceCycle;
    }
    
}
